package net.maku.system.convert;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.annotation.processing.Generated;
import net.maku.email.config.EmailConfig;
import net.maku.system.entity.SysMailConfigEntity;
import net.maku.system.vo.SysMailConfigVO;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-02-10T16:08:32+0800",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.45.0.v20260128-0750, environment: Java 21.0.9 (Eclipse Adoptium)"
)
public class SysMailConfigConvertImpl implements SysMailConfigConvert {

    @Override
    public SysMailConfigEntity convert(SysMailConfigVO vo) {
        if ( vo == null ) {
            return null;
        }

        SysMailConfigEntity sysMailConfigEntity = new SysMailConfigEntity();

        sysMailConfigEntity.setId( vo.getId() );
        sysMailConfigEntity.setCreator( vo.getCreator() );
        if ( vo.getCreateTime() != null ) {
            sysMailConfigEntity.setCreateTime( LocalDateTime.ofInstant( vo.getCreateTime().toInstant(), ZoneId.of( "UTC" ) ) );
        }
        sysMailConfigEntity.setUpdater( vo.getUpdater() );
        if ( vo.getUpdateTime() != null ) {
            sysMailConfigEntity.setUpdateTime( LocalDateTime.ofInstant( vo.getUpdateTime().toInstant(), ZoneId.of( "UTC" ) ) );
        }
        sysMailConfigEntity.setVersion( vo.getVersion() );
        sysMailConfigEntity.setDeleted( vo.getDeleted() );
        sysMailConfigEntity.setAccessKey( vo.getAccessKey() );
        sysMailConfigEntity.setEndpoint( vo.getEndpoint() );
        sysMailConfigEntity.setGroupName( vo.getGroupName() );
        sysMailConfigEntity.setMailFrom( vo.getMailFrom() );
        sysMailConfigEntity.setMailHost( vo.getMailHost() );
        sysMailConfigEntity.setMailPass( vo.getMailPass() );
        sysMailConfigEntity.setMailPort( vo.getMailPort() );
        sysMailConfigEntity.setPlatform( vo.getPlatform() );
        sysMailConfigEntity.setRegionId( vo.getRegionId() );
        sysMailConfigEntity.setSecretKey( vo.getSecretKey() );
        sysMailConfigEntity.setStatus( vo.getStatus() );

        return sysMailConfigEntity;
    }

    @Override
    public SysMailConfigVO convert(SysMailConfigEntity entity) {
        if ( entity == null ) {
            return null;
        }

        SysMailConfigVO sysMailConfigVO = new SysMailConfigVO();

        sysMailConfigVO.setAccessKey( entity.getAccessKey() );
        if ( entity.getCreateTime() != null ) {
            sysMailConfigVO.setCreateTime( Date.from( entity.getCreateTime().toInstant( ZoneOffset.UTC ) ) );
        }
        sysMailConfigVO.setCreator( entity.getCreator() );
        sysMailConfigVO.setDeleted( entity.getDeleted() );
        sysMailConfigVO.setEndpoint( entity.getEndpoint() );
        sysMailConfigVO.setGroupName( entity.getGroupName() );
        sysMailConfigVO.setId( entity.getId() );
        sysMailConfigVO.setMailFrom( entity.getMailFrom() );
        sysMailConfigVO.setMailHost( entity.getMailHost() );
        sysMailConfigVO.setMailPass( entity.getMailPass() );
        sysMailConfigVO.setMailPort( entity.getMailPort() );
        sysMailConfigVO.setPlatform( entity.getPlatform() );
        sysMailConfigVO.setRegionId( entity.getRegionId() );
        sysMailConfigVO.setSecretKey( entity.getSecretKey() );
        sysMailConfigVO.setStatus( entity.getStatus() );
        if ( entity.getUpdateTime() != null ) {
            sysMailConfigVO.setUpdateTime( Date.from( entity.getUpdateTime().toInstant( ZoneOffset.UTC ) ) );
        }
        sysMailConfigVO.setUpdater( entity.getUpdater() );
        sysMailConfigVO.setVersion( entity.getVersion() );

        return sysMailConfigVO;
    }

    @Override
    public List<SysMailConfigVO> convertList(List<SysMailConfigEntity> list) {
        if ( list == null ) {
            return null;
        }

        List<SysMailConfigVO> list1 = new ArrayList<SysMailConfigVO>( list.size() );
        for ( SysMailConfigEntity sysMailConfigEntity : list ) {
            list1.add( convert( sysMailConfigEntity ) );
        }

        return list1;
    }

    @Override
    public EmailConfig convert2(SysMailConfigEntity entity) {
        if ( entity == null ) {
            return null;
        }

        EmailConfig emailConfig = new EmailConfig();

        emailConfig.setAccessKey( entity.getAccessKey() );
        emailConfig.setEndpoint( entity.getEndpoint() );
        emailConfig.setGroupName( entity.getGroupName() );
        emailConfig.setId( entity.getId() );
        emailConfig.setMailFrom( entity.getMailFrom() );
        emailConfig.setMailHost( entity.getMailHost() );
        emailConfig.setMailPass( entity.getMailPass() );
        emailConfig.setMailPort( entity.getMailPort() );
        emailConfig.setPlatform( entity.getPlatform() );
        emailConfig.setRegionId( entity.getRegionId() );
        emailConfig.setSecretKey( entity.getSecretKey() );

        return emailConfig;
    }

    @Override
    public List<EmailConfig> convertList2(List<SysMailConfigEntity> list) {
        if ( list == null ) {
            return null;
        }

        List<EmailConfig> list1 = new ArrayList<EmailConfig>( list.size() );
        for ( SysMailConfigEntity sysMailConfigEntity : list ) {
            list1.add( convert2( sysMailConfigEntity ) );
        }

        return list1;
    }
}
