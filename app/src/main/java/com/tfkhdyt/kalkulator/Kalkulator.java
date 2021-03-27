package com.tfkhdyt.kalkulator;

public class Kalkulator {
  int angka1;
  char operator;
  int angka2;
  
  int tambah(){
    return angka1 + angka2;
  }
  
  int kurang(){
    return angka1 - angka2;
  }
  
  int kali(){
    return angka1 * angka2;
  }
  
  float bagi(){
    return (float) angka1 / (float) angka2;
  }
  
  int mod(){
    return angka1 % angka2;
  }
}
