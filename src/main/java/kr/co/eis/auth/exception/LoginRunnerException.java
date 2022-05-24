package kr.co.eis.auth.exception;

/**
 * packageName: kr.co.eis.auth.exception
 * fileName   : LoginRunnerExcption
 * author     : MinHye_Sim
 * date       : 2022-05-24
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-05-24   MinHye_Sim   최초 생성
 */
public class LoginRunnerException extends RuntimeException {
    private static final long SerializableUID = 1L;

    public LoginRunnerException() {
        super();
    }

    public LoginRunnerException(String msg) {
        super(msg);
    }
}
