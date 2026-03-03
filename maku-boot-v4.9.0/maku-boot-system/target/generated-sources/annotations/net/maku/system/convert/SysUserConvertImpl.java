package net.maku.system.convert;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.annotation.processing.Generated;
import net.maku.framework.security.user.UserDetail;
import net.maku.system.entity.SysUserEntity;
import net.maku.system.vo.SysUserBaseVO;
import net.maku.system.vo.SysUserExcelVO;
import net.maku.system.vo.SysUserVO;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-02-10T16:08:33+0800",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.45.0.v20260128-0750, environment: Java 21.0.9 (Eclipse Adoptium)"
)
public class SysUserConvertImpl implements SysUserConvert {

    @Override
    public SysUserVO convert(SysUserEntity entity) {
        if ( entity == null ) {
            return null;
        }

        SysUserVO sysUserVO = new SysUserVO();

        sysUserVO.setAvatar( entity.getAvatar() );
        sysUserVO.setCreateTime( entity.getCreateTime() );
        sysUserVO.setEmail( entity.getEmail() );
        sysUserVO.setGender( entity.getGender() );
        sysUserVO.setId( entity.getId() );
        sysUserVO.setLeaderId( entity.getLeaderId() );
        sysUserVO.setMobile( entity.getMobile() );
        sysUserVO.setOrgId( entity.getOrgId() );
        sysUserVO.setOrgName( entity.getOrgName() );
        sysUserVO.setPassword( entity.getPassword() );
        sysUserVO.setRealName( entity.getRealName() );
        sysUserVO.setStatus( entity.getStatus() );
        sysUserVO.setSuperAdmin( entity.getSuperAdmin() );
        sysUserVO.setUsername( entity.getUsername() );
        if ( sysUserVO.getTransMap() != null ) {
            Map<String, Object> map = entity.getTransMap();
            if ( map != null ) {
                sysUserVO.getTransMap().putAll( map );
            }
        }

        return sysUserVO;
    }

    @Override
    public SysUserEntity convert(SysUserVO vo) {
        if ( vo == null ) {
            return null;
        }

        SysUserEntity sysUserEntity = new SysUserEntity();

        sysUserEntity.setId( vo.getId() );
        sysUserEntity.setCreateTime( vo.getCreateTime() );
        sysUserEntity.setAvatar( vo.getAvatar() );
        sysUserEntity.setEmail( vo.getEmail() );
        sysUserEntity.setGender( vo.getGender() );
        sysUserEntity.setLeaderId( vo.getLeaderId() );
        sysUserEntity.setMobile( vo.getMobile() );
        sysUserEntity.setOrgId( vo.getOrgId() );
        sysUserEntity.setOrgName( vo.getOrgName() );
        sysUserEntity.setPassword( vo.getPassword() );
        sysUserEntity.setRealName( vo.getRealName() );
        sysUserEntity.setStatus( vo.getStatus() );
        sysUserEntity.setSuperAdmin( vo.getSuperAdmin() );
        sysUserEntity.setUsername( vo.getUsername() );
        if ( sysUserEntity.getTransMap() != null ) {
            Map<String, Object> map = vo.getTransMap();
            if ( map != null ) {
                sysUserEntity.getTransMap().putAll( map );
            }
        }

        return sysUserEntity;
    }

    @Override
    public SysUserEntity convert(SysUserBaseVO vo) {
        if ( vo == null ) {
            return null;
        }

        SysUserEntity sysUserEntity = new SysUserEntity();

        sysUserEntity.setAvatar( vo.getAvatar() );
        sysUserEntity.setEmail( vo.getEmail() );
        sysUserEntity.setGender( vo.getGender() );
        sysUserEntity.setMobile( vo.getMobile() );
        sysUserEntity.setRealName( vo.getRealName() );

        return sysUserEntity;
    }

    @Override
    public SysUserVO convert(UserDetail userDetail) {
        if ( userDetail == null ) {
            return null;
        }

        SysUserVO sysUserVO = new SysUserVO();

        sysUserVO.setAvatar( userDetail.getAvatar() );
        sysUserVO.setCreateTime( userDetail.getCreateTime() );
        sysUserVO.setEmail( userDetail.getEmail() );
        sysUserVO.setGender( userDetail.getGender() );
        sysUserVO.setId( userDetail.getId() );
        sysUserVO.setMobile( userDetail.getMobile() );
        sysUserVO.setOrgId( userDetail.getOrgId() );
        sysUserVO.setPassword( userDetail.getPassword() );
        sysUserVO.setRealName( userDetail.getRealName() );
        sysUserVO.setStatus( userDetail.getStatus() );
        sysUserVO.setSuperAdmin( userDetail.getSuperAdmin() );
        sysUserVO.setUsername( userDetail.getUsername() );

        return sysUserVO;
    }

    @Override
    public UserDetail convertDetail(SysUserEntity entity) {
        if ( entity == null ) {
            return null;
        }

        UserDetail userDetail = new UserDetail();

        userDetail.setId( entity.getId() );
        userDetail.setUsername( entity.getUsername() );
        userDetail.setPassword( entity.getPassword() );
        userDetail.setRealName( entity.getRealName() );
        userDetail.setAvatar( entity.getAvatar() );
        userDetail.setGender( entity.getGender() );
        userDetail.setEmail( entity.getEmail() );
        userDetail.setMobile( entity.getMobile() );
        userDetail.setOrgId( entity.getOrgId() );
        userDetail.setStatus( entity.getStatus() );
        userDetail.setSuperAdmin( entity.getSuperAdmin() );
        userDetail.setTenantId( entity.getTenantId() );
        userDetail.setCreateTime( entity.getCreateTime() );

        return userDetail;
    }

    @Override
    public List<SysUserVO> convertList(List<SysUserEntity> list) {
        if ( list == null ) {
            return null;
        }

        List<SysUserVO> list1 = new ArrayList<SysUserVO>( list.size() );
        for ( SysUserEntity sysUserEntity : list ) {
            list1.add( convert( sysUserEntity ) );
        }

        return list1;
    }

    @Override
    public List<SysUserExcelVO> convert2List(List<SysUserEntity> list) {
        if ( list == null ) {
            return null;
        }

        List<SysUserExcelVO> list1 = new ArrayList<SysUserExcelVO>( list.size() );
        for ( SysUserEntity sysUserEntity : list ) {
            list1.add( sysUserEntityToSysUserExcelVO( sysUserEntity ) );
        }

        return list1;
    }

    @Override
    public List<SysUserEntity> convertListEntity(List<SysUserExcelVO> list) {
        if ( list == null ) {
            return null;
        }

        List<SysUserEntity> list1 = new ArrayList<SysUserEntity>( list.size() );
        for ( SysUserExcelVO sysUserExcelVO : list ) {
            list1.add( sysUserExcelVOToSysUserEntity( sysUserExcelVO ) );
        }

        return list1;
    }

    protected SysUserExcelVO sysUserEntityToSysUserExcelVO(SysUserEntity sysUserEntity) {
        if ( sysUserEntity == null ) {
            return null;
        }

        SysUserExcelVO sysUserExcelVO = new SysUserExcelVO();

        sysUserExcelVO.setCreateTime( sysUserEntity.getCreateTime() );
        sysUserExcelVO.setEmail( sysUserEntity.getEmail() );
        sysUserExcelVO.setGender( sysUserEntity.getGender() );
        sysUserExcelVO.setId( sysUserEntity.getId() );
        sysUserExcelVO.setMobile( sysUserEntity.getMobile() );
        sysUserExcelVO.setOrgId( sysUserEntity.getOrgId() );
        sysUserExcelVO.setRealName( sysUserEntity.getRealName() );
        sysUserExcelVO.setStatus( sysUserEntity.getStatus() );
        sysUserExcelVO.setSuperAdmin( sysUserEntity.getSuperAdmin() );
        sysUserExcelVO.setUsername( sysUserEntity.getUsername() );
        if ( sysUserExcelVO.getTransMap() != null ) {
            Map<String, Object> map = sysUserEntity.getTransMap();
            if ( map != null ) {
                sysUserExcelVO.getTransMap().putAll( map );
            }
        }

        return sysUserExcelVO;
    }

    protected SysUserEntity sysUserExcelVOToSysUserEntity(SysUserExcelVO sysUserExcelVO) {
        if ( sysUserExcelVO == null ) {
            return null;
        }

        SysUserEntity sysUserEntity = new SysUserEntity();

        sysUserEntity.setId( sysUserExcelVO.getId() );
        sysUserEntity.setCreateTime( sysUserExcelVO.getCreateTime() );
        sysUserEntity.setEmail( sysUserExcelVO.getEmail() );
        sysUserEntity.setGender( sysUserExcelVO.getGender() );
        sysUserEntity.setMobile( sysUserExcelVO.getMobile() );
        sysUserEntity.setOrgId( sysUserExcelVO.getOrgId() );
        sysUserEntity.setRealName( sysUserExcelVO.getRealName() );
        sysUserEntity.setStatus( sysUserExcelVO.getStatus() );
        sysUserEntity.setSuperAdmin( sysUserExcelVO.getSuperAdmin() );
        sysUserEntity.setUsername( sysUserExcelVO.getUsername() );
        if ( sysUserEntity.getTransMap() != null ) {
            Map<String, Object> map = sysUserExcelVO.getTransMap();
            if ( map != null ) {
                sysUserEntity.getTransMap().putAll( map );
            }
        }

        return sysUserEntity;
    }
}
