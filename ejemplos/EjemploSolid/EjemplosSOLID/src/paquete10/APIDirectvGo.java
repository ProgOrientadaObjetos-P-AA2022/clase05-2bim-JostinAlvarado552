/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete10;

import java.io.Serializable;

public class APIDirectvGo implements APIMovie, Serializable {

    private String apiKey;

    @Override
    public void establecerApiKey(String ak) {
        apiKey = ak + "808080";
    }

    @Override
    public String obtenerApiKey() {
        return apiKey;
    }

}
