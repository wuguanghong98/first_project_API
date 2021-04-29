package com.red.entity;

import lombok.Data;
import java.util.List;

@Data
public class InformationPageInfo {
     private Integer current;
     private Integer size;
     private Long total;
     private List<Information> infoList;
}
