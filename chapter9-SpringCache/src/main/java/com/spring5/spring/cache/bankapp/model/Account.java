package com.spring5.spring.cache.bankapp.model;

import lombok.Data;

@Data
public class Account {

   private Long id;
   private Long balance;
   private String name;

   public Account(Long id){
      super();
      this.id = id;
   }
}
