package com.revature;

class Robot {
  // This are properties
  boolean powerStatus;
  String color = "Grey";
  int height = 1000;

  static String companyName;
  static int numRobots;

  // This are constructors
  public Robot() {
    powerStatus = true;
    numRobots++;
    height = 1000;
    companyName = "Revature";
  }

  // This are action methods
  public void talk() {
    System.out.println("bleep boop beep");
  }

  public void move() {
    System.out.println("The giant robot rolls down the street");
  }

  void fireLaserbeams() {
    System.out.println("Zaaappp!!!!!!");
  }
}
