package edu.case002;

import java.sql.SQLException;
import java.util.Random;

import com.cni.fw.arch.smb.ac.NormalTxService;
import com.cni.fw.ff.dto.CauseDTO;
import com.cni.fw.ff.dto.EffectDTO;
import com.cni.fw.ff.exception.FrameException;
import com.cni.fw.ff.exception.ServiceException;

/**
 *  <pre>
 *  CASE002 분기형 조회 (A or B) (CASE002.R05)
 *
 *  개발자              : 전찬모
 *
 *  작성날짜            : 20091110
 *
 *  유스케이스 명       : CASE002
 *  유스케이스 아이디   : CASE002
 *  이벤트 명           : 분기형 조회 (A or B)
 *  이벤트 아이디       : R05 
 *  설계자              : 전찬모
 * 
 *  업무 유형           : Tx
 *  입력 채널 유형      : WEB
 *  출력 채널 유형      : BRANCH
 *  출력 URL            : CASE002.R01  CASE002.R02
 *
 *  비고                : 
 *  </pre>
 */
public class CASE002R05AC extends NormalTxService {


    public CASE002R05AC(Class clazz) throws FrameException {
        super(clazz);
    }

    protected void process(CauseDTO input, EffectDTO output) throws FrameException, ServiceException, SQLException {

    	Random random = new Random();
    	int branch = random.nextInt(2); // 0~1 사이의 랜덤한 값이 생성된다.
    	output.setBranchPoint(branch);
    }
}
