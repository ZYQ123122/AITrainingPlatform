package net.maku.iot.convert;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import net.maku.iot.entity.IotDeviceEntity;
import net.maku.iot.vo.IotDeviceVO;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-02-10T16:08:38+0800",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.45.0.v20260128-0750, environment: Java 21.0.9 (Eclipse Adoptium)"
)
public class IotDeviceConvertImpl implements IotDeviceConvert {

    @Override
    public IotDeviceEntity convert(IotDeviceVO vo) {
        if ( vo == null ) {
            return null;
        }

        IotDeviceEntity iotDeviceEntity = new IotDeviceEntity();

        iotDeviceEntity.setId( vo.getId() );
        iotDeviceEntity.setCreator( vo.getCreator() );
        iotDeviceEntity.setCreateTime( vo.getCreateTime() );
        iotDeviceEntity.setUpdater( vo.getUpdater() );
        iotDeviceEntity.setUpdateTime( vo.getUpdateTime() );
        iotDeviceEntity.setAppVersion( vo.getAppVersion() );
        iotDeviceEntity.setBatteryPercent( vo.getBatteryPercent() );
        iotDeviceEntity.setCode( vo.getCode() );
        iotDeviceEntity.setDownTime( vo.getDownTime() );
        iotDeviceEntity.setName( vo.getName() );
        iotDeviceEntity.setProtocolType( vo.getProtocolType() );
        iotDeviceEntity.setRunningStatus( vo.getRunningStatus() );
        iotDeviceEntity.setSecret( vo.getSecret() );
        iotDeviceEntity.setStatus( vo.getStatus() );
        iotDeviceEntity.setTemperature( vo.getTemperature() );
        iotDeviceEntity.setTenantId( vo.getTenantId() );
        iotDeviceEntity.setType( vo.getType() );
        iotDeviceEntity.setUid( vo.getUid() );
        iotDeviceEntity.setUpTime( vo.getUpTime() );

        return iotDeviceEntity;
    }

    @Override
    public IotDeviceVO convert(IotDeviceEntity entity) {
        if ( entity == null ) {
            return null;
        }

        IotDeviceVO iotDeviceVO = new IotDeviceVO();

        iotDeviceVO.setAppVersion( entity.getAppVersion() );
        iotDeviceVO.setBatteryPercent( entity.getBatteryPercent() );
        iotDeviceVO.setCode( entity.getCode() );
        iotDeviceVO.setCreateTime( entity.getCreateTime() );
        iotDeviceVO.setCreator( entity.getCreator() );
        iotDeviceVO.setDownTime( entity.getDownTime() );
        iotDeviceVO.setId( entity.getId() );
        iotDeviceVO.setName( entity.getName() );
        iotDeviceVO.setProtocolType( entity.getProtocolType() );
        iotDeviceVO.setRunningStatus( entity.getRunningStatus() );
        iotDeviceVO.setSecret( entity.getSecret() );
        iotDeviceVO.setStatus( entity.getStatus() );
        iotDeviceVO.setTemperature( entity.getTemperature() );
        iotDeviceVO.setTenantId( entity.getTenantId() );
        iotDeviceVO.setType( entity.getType() );
        iotDeviceVO.setUid( entity.getUid() );
        iotDeviceVO.setUpTime( entity.getUpTime() );
        iotDeviceVO.setUpdateTime( entity.getUpdateTime() );
        iotDeviceVO.setUpdater( entity.getUpdater() );

        return iotDeviceVO;
    }

    @Override
    public List<IotDeviceVO> convertList(List<IotDeviceEntity> list) {
        if ( list == null ) {
            return null;
        }

        List<IotDeviceVO> list1 = new ArrayList<IotDeviceVO>( list.size() );
        for ( IotDeviceEntity iotDeviceEntity : list ) {
            list1.add( convert( iotDeviceEntity ) );
        }

        return list1;
    }
}
