package com.green.greengram.user;

import com.green.greengram.user.model.*;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.multipart.MultipartFile;

public interface UserService {
    int postUser(MultipartFile mf, SignUpPostReq p);
    SignInRes postSignIn(HttpServletResponse res, SignInPostReq p);
    UserInfoGetRes getUserInfo(UserInfoGetReq p);
    String patchProfilePic(UserProfilePatchReq p);
}
