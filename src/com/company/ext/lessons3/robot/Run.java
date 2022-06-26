package com.company.ext.lessons3.robot;

import com.company.ext.lessons3.robot.hands.IHand;
import com.company.ext.lessons3.robot.hands.SamsungHand;
import com.company.ext.lessons3.robot.hands.SonyHand;
import com.company.ext.lessons3.robot.hands.ToshibaHand;
import com.company.ext.lessons3.robot.heads.IHead;
import com.company.ext.lessons3.robot.heads.SamsungHead;
import com.company.ext.lessons3.robot.heads.SonyHead;
import com.company.ext.lessons3.robot.heads.ToshibaHead;
import com.company.ext.lessons3.robot.legs.ILeg;
import com.company.ext.lessons3.robot.legs.SamsungLeg;
import com.company.ext.lessons3.robot.legs.SonyLeg;
import com.company.ext.lessons3.robot.legs.ToshibaLeg;

import java.util.Scanner;


public class Run {
    public static void main(String[] args) {
        /*
        Создать по 3 реализации(Sony, Toshiba, Samsung) каждой запчасти(IHead, IHand, ILeg)
        Класс SonyHead является примером реализацией головы от Sony.
        Создайте 3 робота с разными комплектующими.
        Например у робота голова и нога от Sony а, рука от Samsung.
        У всех роботов вызовите метод action.
        Среди 3-х роботов найдите самого дорогого.
        */

        IHead head = new SonyHead(450);
        IHand hand = new SonyHand(550);
        ILeg leg = new SonyLeg(650);
        SonyRobot robot = new SonyRobot(head,hand, leg);
        robot.action();
        System.out.println(robot.getPrice());

        IHead head1 = new SamsungHead(150);
        IHand hand1 = new SamsungHand(250);
        ILeg leg1 = new SamsungLeg(350);
        SamsungRobot robot1 = new SamsungRobot(head1, hand1 , leg1);
        robot1.action();
        System.out.println(robot1.getPrice());

        IHead head2 = new ToshibaHead(750);
        IHand hand2 = new ToshibaHand(850);
        ILeg leg2 = new ToshibaLeg(950);
        ToshibaRobot robot2 = new ToshibaRobot(head2, hand2, leg2);
        robot2.action();
        System.out.println(robot2.getPrice());

//        IHead head = new SonyHead(450);
//        IHand hand1 = new SamsungHand(250);
//        ILeg leg2 = new ToshibaLeg(950);
//        SamsungRobot robot3 = new SamsungRobot(head,hand1,leg2);
//        robot3.action();
//        System.out.println(robot3.getPrice());



        int a = robot.getPrice();
        int b = robot1.getPrice();
        int c = robot2.getPrice();
        int max;
        if(a > b){
            max = a;
        }else {
            max = b;
        }if(max > c){
            System.out.println(max);
        }else {
            System.out.println("Самый дорогой робот стоит " + c + " руб.");

        }

    }
}


