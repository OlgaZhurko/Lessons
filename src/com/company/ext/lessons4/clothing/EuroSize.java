package com.company.ext.lessons4.clothing;

public enum EuroSize {
    XXS(32){
        @Override
        public String getDescription() {
            return "Детский размер";
        }
    }, XS(34), S(36), M(38), L(40);

    private int size;

    EuroSize(int size) {
        this.size = size;
    }
    public String getDescription(){
        return "Взрослый размер";
    }

    @Override
    public String toString() {
        return "EuroSize{" +
                "size=" + size + getDescription();
    }
}
