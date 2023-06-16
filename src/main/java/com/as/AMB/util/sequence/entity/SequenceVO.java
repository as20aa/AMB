package com.as.AMB.util.sequence.entity;

public class SequenceVO {
    public String seqName;
    public String initValue;
    public String maxValue;
    public String currValue;
    public String step;
    public String indStatus;

    public String getSeqName() {
        return seqName;
    }

    public void setSeqName(String seqName) {
        this.seqName = seqName;
    }

    public String getInitValue() {
        return initValue;
    }

    public void setInitValue(String initValue) {
        this.initValue = initValue;
    }

    public String getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(String maxValue) {
        this.maxValue = maxValue;
    }

    public String getCurrValue() {
        return currValue;
    }

    public void setCurrValue(String currValue) {
        this.currValue = currValue;
    }

    public String getStep() {
        return step;
    }

    public void setStep(String step) {
        this.step = step;
    }

    public String getIndStatus() {
        return indStatus;
    }

    public void setIndStatus(String indStatus) {
        this.indStatus = indStatus;
    }

    @Override
    public String toString() {
        return "SequenceVO{" +
                "seqName='" + seqName + '\'' +
                ", initValue='" + initValue + '\'' +
                ", maxValue='" + maxValue + '\'' +
                ", currValue='" + currValue + '\'' +
                ", step='" + step + '\'' +
                ", indStatus='" + indStatus + '\'' +
                '}';
    }
}
