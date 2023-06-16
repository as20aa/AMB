package com.as.AMB.util;

import com.as.AMB.util.sequence.SequenceUtil;
import org.springframework.beans.factory.annotation.Autowired;

public class CommonUtils {
    public static String getSequence(String name) {
        return SequenceUtil.generateId(name);
    }
}
