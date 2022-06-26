package com.company.ext.lessons4.tool;

public class Run {
    public static void main(String[] args) {
        Tool tool = new Guitar(6);
        Tool tool1 = new Drum("большой");
        Tool tool2 = new Pipe(12.5);
        Tool[] t = {tool,tool1,tool2};
        for (Tool tool3 : t){
            if (tool3 instanceof Tool){
                tool3.play();
            }
        }
    }
}

