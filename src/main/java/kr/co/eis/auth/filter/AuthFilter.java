package kr.co.eis.auth.filter;

import kr.co.eis.auth.configs.AuthProvider;
import kr.co.eis.auth.exception.SecurityRuntimeException;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * packageName: kr.co.eis.auth.filter
 * fileName   : AuthFilter
 * author     : MinHye_Sim
 * date       : 2022-05-25
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-05-25   MinHye_Sim   최초 생성
 */

@RequiredArgsConstructor
public class AuthFilter extends OncePerRequestFilter {
    private final AuthProvider provider;

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        String token = provider.resolveToken(request); // 1. provider가 토큰을 판단 2.resolveTonken()이 처리
        try{ //토큰에 대한 유효성을 판단
            if(token != null && provider.validateToken(token)) {
                //1.없으면 1차적으로 제거
                //2.프로바이더가 판단
                //3.validateToken()이 해당 토큰이 유효한지 확인(?)
                Authentication auth = provider.getAuthentication(token);
                SecurityContextHolder.clearContext();
                SecurityContextHolder.getContext().setAuthentication(auth);

            }
        }
        catch (SecurityRuntimeException ex) {
            //this is very important, since it guarantees the user is not authenticated at all
            SecurityContextHolder.clearContext();
            response.sendError(ex.getHttpStatus().value(), ex.getMessage());
            return;
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        filterChain.doFilter(request, response); //입장하는 것도 나가는 것도

    }
}
