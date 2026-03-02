package net.maku.iot.convert;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import net.maku.iot.entity.IotDeviceServiceLogEntity;
import net.maku.iot.vo.IotDeviceServiceLogVO;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-02-10T16:08:38+0800",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.45.0.v20260128-0750, environment: Java 21.0.9 (Eclipse Adoptium)"
)
public class IotDeviceServiceLogConvertImpl implements IotDeviceServiceLogConvert {

    @Override
    public IotDeviceServiceLogEntity convert(IotDeviceServiceLogVO vo) {
        if ( vo == null ) {
            return null;
        }

        IotDeviceServiceLogEntity iotDeviceServiceLogEntity = new IotDeviceServiceLogEntity();

        iotDeviceServiceLogEntity.setCreateTime( vo.getCreateTime() );
        iotDeviceServiceLogEntity.setServicePayload( vo.getServicePayload() );
        iotDeviceServiceLogEntity.setServiceTime( vo.getServiceTime() );
        iotDeviceServiceLogEntity.setServiceType( vo.getServiceType() );
        iotDeviceServiceLogEntity.setServiceUid( vo.getServiceUid() );

        return iotDeviceServiceLogEntity;
    }

    @Override
    public IotDeviceServiceLogVO convert(IotDeviceServiceLogEntity entity) {
        if ( entity == null ) {
            return null;
        }

        IotDeviceServiceLogVO iotDeviceServiceLogVO = new IotDeviceServiceLogVO();

        iotDeviceServiceLogVO.setCreateTime( entity.getCreateTime() );
        iotDeviceServiceLogVO.setServicePayload( entity.getServicePayload() );
        iotDeviceServiceLogVO.setServiceTime( entity.getServiceTime() );
        iotDeviceServiceLogVO.setServiceType( entity.getServiceType() );
        iotDeviceServiceLogVO.setServiceUid( entity.getServiceUid() );

        return iotDeviceServiceLogVO;
    }

    @Override
    public List<IotDeviceServiceLogVO> convertList(List<IotDeviceServiceLogEntity> list) {
        if ( list == null ) {
            return null;
        }

        List<IotDeviceServiceLogVO> list1 = new ArrayList<IotDeviceServiceLogVO>( list.size() );
        for ( IotDeviceServiceLogEntity iotDeviceServiceLogEntity : list ) {
            list1.add( convert( iotDeviceServiceLogEntity ) );
        }

        return list1;
    }
}
