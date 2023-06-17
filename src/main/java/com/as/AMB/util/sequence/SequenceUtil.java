package com.as.AMB.util.sequence;

import com.as.AMB.util.sequence.dao.SequenceDAO;
import com.as.AMB.util.Constants;
import com.as.AMB.util.sequence.entity.SequenceVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class SequenceUtil {

    @Autowired
    private SequenceDAO sequenceDAO;

    public String generateId(String seqName){
        SequenceVO sequenceVO = new SequenceVO();
        sequenceVO.setSeqName(seqName);
        if(sequenceDAO.check(sequenceVO)!=1) {
            sequenceVO.setSeqName(seqName);
            sequenceVO.setInitValue(Constants.SEQ_INIT_VALUE);
            sequenceVO.setCurrValue(Constants.SEQ_INIT_VALUE);
            sequenceVO.setMaxValue(Constants.SEQ_MAX_VALUE);
            sequenceVO.setStep(Constants.SEQ_STEP);
            sequenceVO.setIndStatus(Constants.VALIDATE);
            sequenceDAO.insert(sequenceVO);
        }
        sequenceDAO.generateId(sequenceVO);
        return String.format("%010d", Integer.valueOf(sequenceVO.getCurrValue()));
    }
}
