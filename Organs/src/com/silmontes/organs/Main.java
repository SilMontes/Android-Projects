package com.silmontes.organs;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Patient patient = new Patient(
                "Brad",
                20,
                new Eye("Left Eye","shorted sighted","Blue",true),
                new Eye("Right Eye","normal","Blue",true),
                new Heart("Heart","normal",65),
                new Stomach("stomach","Good",false),
                new Skin("skin","burned","white",40)
        );

        Patient patient2 = new Patient(
                "Tom",
                20,
                new Eye("Left Eye","normal","Brown",true),
                new Eye("Right Eye","normal","Brown",true),
                new Heart("Heart","hypertention",65),
                new Stomach("stomach","Good",false),
                new Skin("skin","burned","brown",40)
        );

        System.out.println("Choose a patient");
        System.out.println("1. Brad");
        System.out.println("2. Tom");
        int option = sc.nextInt();
        Patient choosen;

        if(option ==1){
            System.out.println("Name: "+patient.getName());
            System.out.println("Age: "+patient.getAge());
            choosen =patient;
        }else{
            System.out.println("Name: "+patient2.getName());
            System.out.println("Age: "+patient2.getAge());
            choosen =patient2;
        }
        boolean shouldFinish = false;

        while(!shouldFinish){

            System.out.println("Choose an organ"+
                    "\n\t1. Left Eye"+
                    "\n\t2. Right Eye"+
                    "\n\t3. Heart"+
                    "\n\t4. Stomach"+
                    "\n\t5. Skin"+
                    "\n\t6. Quit"
                    );

            int choice = sc.nextInt();
            switch (choice){
                case 1:
                    choosen.getLeftEye().getDetails();
                    if(choosen.getLeftEye().isOpen()){
                        System.out.println("\t1. Close Eye");
                        if (sc.nextInt()==1){
                            choosen.getLeftEye().closeEye();
                        }else{
                            continue;
                        }
                    }else{
                        System.out.println("\t1. Open Eye");
                        if (sc.nextInt()==1){
                            choosen.getLeftEye().openEye();
                        }else{
                            continue;
                        }
                    }
                    break;

                case 2:
                    choosen.getRightEye().getDetails();
                    if(choosen.getRightEye().isOpen()){
                        System.out.println("\t1. Close Eye");
                        if (sc.nextInt()==1){
                            choosen.getRightEye().closeEye();
                        }else{
                            continue;
                        }
                    }else{
                        System.out.println("\t1. Open Eye");
                        if (sc.nextInt()==1){
                            choosen.getRightEye().openEye();
                        }else{
                            continue;
                        }
                    }
                    break;
                case 3:
                    choosen.getHeart().getDetails();
                    System.out.println("Change the heart rate");
                    if(sc.nextInt() == 1){
                        System.out.println("Enter the new Heart rate: ");
                        int newHeartRate = sc.nextInt();
                        choosen.getHeart().setRate(newHeartRate);
                        System.out.println("Heart rate chance to "+choosen.getHeart().getRate());
                    }else{
                        continue;
                    }
                    break;
                case 4:
                    choosen.getStomach().getDetails();
                    System.out.println("\t\t1. Digest");
                    if(sc.nextInt()==1){
                        choosen.getStomach().digest();
                    }else{
                        continue;
                    }
                    break;
                case 5:
                    choosen.getSkin().getSkinColor();
                    break;
                default:
                    shouldFinish = true;
                    break;

            }

        }

    }

}
