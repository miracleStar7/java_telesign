package com.telesign.example.voice;

import com.telesign.RestClient;
import com.telesign.VoiceClient;

public class SendVoiceCall {

    public static void main(String[] args) {

        String customerId = "FFFFFFFF-EEEE-DDDD-1234-AB1234567890";
        String apiKey = "EXAMPLE----TE8sTgg45yusumoN6BYsBVkh+yRJ5czgsnCehZaOYldPJdmFh6NeX8kunZ2zU1YWaUw/0wV6xfw==";

        String phoneNumber = "phone_number";

        String message = "You're scheduled for a dentist appointment at 2:30PM.";
        String messageType = "ARN";

        try {
            VoiceClient voiceClient = new VoiceClient(customerId, apiKey);
            RestClient.TelesignResponse telesignResponse = voiceClient.call(phoneNumber, message, messageType, null);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}