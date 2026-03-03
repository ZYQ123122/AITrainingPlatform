package net.maku.system.convert;

import java.time.LocalDateTime;
import javax.annotation.processing.Generated;
import net.maku.system.entity.SysUserTokenEntity;
import net.maku.system.vo.SysUserTokenVO;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-02-10T16:08:32+0800",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.45.0.v20260128-0750, environment: Java 21.0.9 (Eclipse Adoptium)"
)
public class SysUserTokenConvertImpl implements SysUserTokenConvert {

    @Override
    public SysUserTokenEntity convert(SysUserTokenVO vo) {
        if ( vo == null ) {
            return null;
        }

        SysUserTokenEntity sysUserTokenEntity = new SysUserTokenEntity();

        sysUserTokenEntity.setAccessToken( vo.getAccessToken() );
        sysUserTokenEntity.setAccessTokenExpire( vo.getAccessTokenExpire() );
        sysUserTokenEntity.setRefreshToken( vo.getRefreshToken() );
        sysUserTokenEntity.setRefreshTokenExpire( vo.getRefreshTokenExpire() );

        return sysUserTokenEntity;
    }

    @Override
    public SysUserTokenVO convert(SysUserTokenEntity entity) {
        if ( entity == null ) {
            return null;
        }

        String accessToken = null;
        LocalDateTime accessTokenExpire = null;
        String refreshToken = null;
        LocalDateTime refreshTokenExpire = null;

        accessToken = entity.getAccessToken();
        accessTokenExpire = entity.getAccessTokenExpire();
        refreshToken = entity.getRefreshToken();
        refreshTokenExpire = entity.getRefreshTokenExpire();

        SysUserTokenVO sysUserTokenVO = new SysUserTokenVO( accessToken, refreshToken, accessTokenExpire, refreshTokenExpire );

        return sysUserTokenVO;
    }
}
