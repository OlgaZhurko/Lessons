package com.company.ext.lessons3.robot;

import com.company.ext.lessons3.robot.hands.IHand;
import com.company.ext.lessons3.robot.heads.IHead;
import com.company.ext.lessons3.robot.legs.ILeg;

public class ToshibaRobot implements IRobot{
    private IHead head2;
    private IHand hand2;
    private ILeg leg2;

    public ToshibaRobot(IHead head2, IHand hand2, ILeg leg2) {
        this.head2 = head2;
        this.hand2 = hand2;
        this.leg2 = leg2;
    }

    public ToshibaRobot() {
    }

    public IHead getHead2() {
        return head2;
    }

    public void setHead2(IHead head2) {
        this.head2 = head2;
    }

    public IHand getHand2() {
        return hand2;
    }

    public void setHand2(IHand hand2) {
        this.hand2 = hand2;
    }

    public ILeg getLeg2() {
        return leg2;
    }

    public void setLeg2(ILeg leg2) {
        this.leg2 = leg2;
    }

    @Override
    public void action() {
        head2.speek();
        hand2.upHand();
        leg2.step();
    }

    @Override
    public int getPrice() {
        int price = head2.getPrice() + hand2.getPrice() + leg2.getPrice();
        return price;
    }
}
