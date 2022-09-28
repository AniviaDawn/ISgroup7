package com.group7.isgroup7.pojo;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@lombok.Data
@AllArgsConstructor
@NoArgsConstructor
public class Data {
    private List list;
}
