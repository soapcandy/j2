package org.zerock.j2.service;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
@Log4j2
public class SocialServiceImpl implements SocialService{
    @Value("${org.zerock.kakao.token_url}")
    private String tokenURL;
    @Value("${org.zerock.kakao.rest_key}")
    private String clientId;
    @Value("${org.zerock.kakao.redirect_uri}")
    private String redirectURI;
    @Value("${org.zerock.kakao.get_user}")
    private String  getUser;
    @Override
    public String getKakaoEmail(String authCode) {

        log.info("================================");
        log.info("authCode: " + authCode);
        log.info("tokenURL: " + tokenURL);
        log.info("clientId: " + clientId);
        log.info("redirectURI: " + redirectURI);
        log.info("getUser: " + getUser);

        return null;
    }
}
