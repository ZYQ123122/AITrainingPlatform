package net.maku.system.convert;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import net.maku.sms.config.SmsConfig;
import net.maku.system.entity.SysSmsConfigEntity;
import net.maku.system.vo.SysSmsConfigVO;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-02-10T16:08:32+0800",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.45.0.v20260128-0750, environment: Java 21.0.9 (Eclipse Adoptium)"
)
public class SysSmsConfigConvertImpl implements SysSmsConfigConvert {

    @Override
    public SysSmsConfigEntity convert(SysSmsConfigVO vo) {
        if ( vo == null ) {
            return null;
        }

        SysSmsConfigEntity sysSmsConfigEntity = new SysSmsConfigEntity();

        sysSmsConfigEntity.setId( vo.getId() );
        sysSmsConfigEntity.setCreateTime( vo.getCreateTime() );
        sysSmsConfigEntity.setAccessKey( vo.getAccessKey() );
        sysSmsConfigEntity.setAppId( vo.getAppId() );
        sysSmsConfigEntity.setGroupName( vo.getGroupName() );
        sysSmsConfigEntity.setPlatform( vo.getPlatform() );
        sysSmsConfigEntity.setSecretKey( vo.getSecretKey() );
        sysSmsConfigEntity.setSenderId( vo.getSenderId() );
        sysSmsConfigEntity.setSignName( vo.getSignName() );
        sysSmsConfigEntity.setStatus( vo.getStatus() );
        sysSmsConfigEntity.setTemplateId( vo.getTemplateId() );
        sysSmsConfigEntity.setUrl( vo.getUrl() );

        return sysSmsConfigEntity;
    }

    @Override
    public SysSmsConfigVO convert(SysSmsConfigEntity entity) {
        if ( entity == null ) {
            return null;
        }

        SysSmsConfigVO sysSmsConfigVO = new SysSmsConfigVO();

        sysSmsConfigVO.setAccessKey( entity.getAccessKey() );
        sysSmsConfigVO.setAppId( entity.getAppId() );
        sysSmsConfigVO.setCreateTime( entity.getCreateTime() );
        sysSmsConfigVO.setGroupName( entity.getGroupName() );
        sysSmsConfigVO.setId( entity.getId() );
        sysSmsConfigVO.setPlatform( entity.getPlatform() );
        sysSmsConfigVO.setSecretKey( entity.getSecretKey() );
        sysSmsConfigVO.setSenderId( entity.getSenderId() );
        sysSmsConfigVO.setSignName( entity.getSignName() );
        sysSmsConfigVO.setStatus( entity.getStatus() );
        sysSmsConfigVO.setTemplateId( entity.getTemplateId() );
        sysSmsConfigVO.setUrl( entity.getUrl() );

        return sysSmsConfigVO;
    }

    @Override
    public List<SysSmsConfigVO> convertList(List<SysSmsConfigEntity> list) {
        if ( list == null ) {
            return null;
        }

        List<SysSmsConfigVO> list1 = new ArrayList<SysSmsConfigVO>( list.size() );
        for ( SysSmsConfigEntity sysSmsConfigEntity : list ) {
            list1.add( convert( sysSmsConfigEntity ) );
        }

        return list1;
    }

    @Override
    public SmsConfig convert2(SysSmsConfigEntity entity) {
        if ( entity == null ) {
            return null;
        }

        SmsConfig smsConfig = new SmsConfig();

        smsConfig.setAccessKey( entity.getAccessKey() );
        smsConfig.setAppId( entity.getAppId() );
        smsConfig.setGroupName( entity.getGroupName() );
        smsConfig.setId( entity.getId() );
        smsConfig.setPlatform( entity.getPlatform() );
        smsConfig.setSecretKey( entity.getSecretKey() );
        smsConfig.setSenderId( entity.getSenderId() );
        smsConfig.setSignName( entity.getSignName() );
        smsConfig.setTemplateId( entity.getTemplateId() );
        smsConfig.setUrl( entity.getUrl() );

        return smsConfig;
    }

    @Override
    public List<SmsConfig> convertList2(List<SysSmsConfigEntity> list) {
        if ( list == null ) {
            return null;
        }

        List<SmsConfig> list1 = new ArrayList<SmsConfig>( list.size() );
        for ( SysSmsConfigEntity sysSmsConfigEntity : list ) {
            list1.add( convert2( sysSmsConfigEntity ) );
        }

        return list1;
    }
}
