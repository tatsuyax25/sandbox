package com.revature;

import java.util.Scanner;

class App {
  
  public static void main ( String[] args ){

    Scanner scanner = new Scanner(System.in);

    String[] dinosaurs = {"Triceratops", "T-Rex", "Velociraptor", "Gigantosaurus"};

    boolean loopSwitch = true;
    do {

      System.out.println("\nWelcome to the dinosaur adoption app. Please select the type of dinosaur you would like to adopt.");

      for(int i = 0; i < 4; i++) {
      System.out.println(i + 1 + ") " + dinosaurs[i]);
      }

      System.out.println("5) Exit");

      String selection = scanner.nextLine();

      switch(selection) {
        case "1":
          System.out.println("\nYou adopted a Triceratops! They have 3 horns and like to eat plants.");
          break;
        case "2":
          System.out.println("\nYou adopted a T-Rex! They have have giant, razor sharp teeth but tiny little arms so they aren't good at giving hugs.");
          break;
        case "3":
          System.out.println("\nYou adopted a Velociraptor! That was probably a bad idea.");
          break;
        case "4":
          System.out.println("\nYou adopted a Gigantosaurus! Some scientists think they are biger than the T-Rex! But other scientists say they are the same size. That isn't very helpful, scientists...");
          break;
        case "5":
          System.out.println("\nThanks for helping these dinosaurs finda a good home! Your neighbors are not going to be happy.");
          loopSwitch = false;
          break;
        
        default: {
        System.out.println("\nWait, you want to adopt a kangaroo? What!");
        }
      }

    } while(loopSwitch);

  }
}