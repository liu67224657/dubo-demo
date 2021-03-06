package com.ericliu.dubbo.provider.auth.mapper;

import com.ericliu.dubbo.api.auth.dto.AuthDTO;
import com.ericliu.dubbo.api.auth.dto.AuthUserDTO;
import com.ericliu.dubbo.provider.auth.domain.Auth;
import com.ericliu.dubbo.provider.auth.domain.AuthUser;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * @author <a href=mailto:ericliu@fivewh.com>ericliu</a>,Date:2017/12/11
 */
@Mapper
public interface AuthMapper {
    AuthMapper INSTANCE = Mappers.getMapper(AuthMapper.class);

    AuthDTO toAuthDTO(Auth entity);

    Auth toAuthEntity(AuthDTO authDTO);


    AuthUserDTO toAuthUserDTO(AuthUser authUser);

    List<AuthUserDTO> toAuthUserDTOList(List<AuthUser> authUser);

    AuthUser toAuthUserEntity(AuthUserDTO authUserDTO);
}
