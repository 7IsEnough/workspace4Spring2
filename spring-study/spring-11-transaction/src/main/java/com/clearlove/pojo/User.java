package com.clearlove.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author promise
 * @date 2024/2/20 - 0:35
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

  private int id;
  private String pwd;
  private String name;

}
