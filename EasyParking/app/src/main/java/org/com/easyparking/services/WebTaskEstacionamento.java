package org.com.easyparking.services;

import android.content.Context;

import org.com.easyparking.R;
import org.com.easyparking.model.Estacionamento;
import org.com.easyparking.model.Usuario;
import org.greenrobot.eventbus.EventBus;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class WebTaskEstacionamento extends WebTaskBase{

    private static String SERVICE_URL = "login";
    private String cnpj;

    public WebTaskEstacionamento(Context context, String cnpj){
        super(context, SERVICE_URL);
        this.cnpj = cnpj;
    }

    @Override
    public void handleResponse(String response) {
        Estacionamento estacionamento = new Estacionamento();
        try {
            JSONObject responseAsJSON = new JSONObject(response);
            String nome = responseAsJSON.getString("name");
            estacionamento.setNome(nome);
            String valor = responseAsJSON.getString("valor");
            estacionamento.setValor(Double.valueOf(valor));
            String endereco = responseAsJSON.getString("name");
            estacionamento.setEndereco(endereco);
            EventBus.getDefault().post(endereco);

        } catch (JSONException e) {
            if(!isSilent()){
                EventBus.getDefault().post(new Error(getContext().getString(R.string.label_error_invalid_response)));
            }
        }
    }

    private Estacionamento readEstacionamento(JSONObject userAsJSON)  throws  JSONException{
        Estacionamento estacionamento = new Estacionamento();
        estacionamento.setNome(userAsJSON.getString("nome"));
        estacionamento.setEndereco(userAsJSON.getString("endereco"));
        estacionamento.setValor(userAsJSON.getDouble("valor"));
        return estacionamento;
    }

    @Override
    public String getRequestBody(){
        Map<String,String> requestMap = new HashMap<>();
        requestMap.put("email", cnpj);

        JSONObject json = new JSONObject(requestMap);
        String jsonString = json.toString();

        return  jsonString;
    }

}
