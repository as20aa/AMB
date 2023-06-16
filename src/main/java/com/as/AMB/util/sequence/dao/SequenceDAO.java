package com.as.AMB.util.sequence.dao;

import org.apache.ibatis.annotations.Mapper;
import com.as.AMB.util.sequence.entity.SequenceVO;

@Mapper
public interface SequenceDAO {
    int check(SequenceVO sequenceVO);
    int insert(SequenceVO sequenceVO);
    void generateId(SequenceVO sequenceVO);
}
