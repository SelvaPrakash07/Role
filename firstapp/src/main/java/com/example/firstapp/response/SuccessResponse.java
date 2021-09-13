package com.example.firstapp.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;


@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class SuccessResponse implements Serializable {

    private static final long serialVersionUID = 5926468583005150707L;
    private String statusCode;

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public String getStatusMessage() {
        return statusMessage;
    }

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    private String statusMessage;

}
