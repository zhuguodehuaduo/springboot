package com.lry.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author liurenyi
 * @create 2019--12--26--10:04
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
   private int stuid;
   private String stuname;
   private String stupassword;
}
