package com.example.firstapp.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@ToString
public class BaseResponse<T> extends SuccessResponse implements Serializable {

    private static final long serialVersionUID = 5926468583005150707L;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    private T data;
    /*PaginationVO pagination;*/
}
