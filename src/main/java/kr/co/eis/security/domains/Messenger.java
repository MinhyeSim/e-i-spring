package kr.co.eis.security.domains;

import lombok.Builder;
import lombok.Getter;

/**
 * packageName: kr.co.eis.security.domains
 * fileName   : Messenger
 * author     : MinHye_Sim
 * date       : 2022-05-23
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-05-23   MinHye_Sim   최초 생성
 */
@Getter @Builder
public class Messenger {
    private String message, code;
    private int status;
}
