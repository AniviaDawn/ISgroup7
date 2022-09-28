package com.group7.isgroup7.pojo;

import com.group7.isgroup7.utils.Error;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Result<E> {
    private Error error;
    private E data;
}
