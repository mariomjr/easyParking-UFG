package org.com.easyparking.services;

import android.content.Context;

import org.com.easyparking.R;
import org.com.easyparking.model.Usuario;
import org.greenrobot.eventbus.EventBus;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class WebTaskLogin extends WebTaskBase{

    private static String SERVICE_URL = "login";
    private String email;
    private String password;

    public WebTaskLogin(Context context, String email, String password){
        super(context, SERVICE_URL);
        this.email = email;
        this.password = password;
    }

    @Override
    public void handleResponse(String response) {
        Usuario usuario = new Usuario();
        try {
            JSONObject responseAsJSON = new JSONObject(response);
            String nome = responseAsJSON.getString("name");
            usuario.setNome(nome);
            String login = responseAsJSON.getString("username");
            usuario.setLogin(login);
            EventBus.getDefault().post(usuario);

        } catch (JSONException e) {
            if(!isSilent()){
                EventBus.getDefault().post(new Error(getContext().getString(R.string.label_error_invalid_response)));
            }
        }
    }

    private Usuario readUser(JSONObject userAsJSON)  throws  JSONException{
        Usuario usuario = new Usuario();
        usuario.setNome(userAsJSON.getString("name"));
        usuario.setLogin(userAsJSON.getString("username"));
        return usuario;
    }

    @Override
    public String getRequestBody(){
        Map<String,String> requestMap = new HashMap<>();
        requestMap.put("email", email);
        requestMap.put("password", password);

        JSONObject json = new JSONObject(requestMap);
        String jsonString = json.toString();

        return  jsonString;
    }

}
