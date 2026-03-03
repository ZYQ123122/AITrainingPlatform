package net.maku.iot.convert;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import net.maku.iot.entity.IotDeviceEventLogEntity;
import net.maku.iot.vo.IotDeviceEventLogVO;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-02-10T16:08:38+0800",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.45.0.v20260128-0750, environment: Java 21.0.9 (Eclipse Adoptium)"
)
public class IotDeviceEventLogConvertImpl implements IotDeviceEventLogConvert {

    @Override
    public IotDeviceEventLogEntity convert(IotDeviceEventLogVO vo) {
        if ( vo == null ) {
            return null;
        }

        IotDeviceEventLogEntity iotDeviceEventLogEntity = new IotDeviceEventLogEntity();

        iotDeviceEventLogEntity.setEventPayload( vo.getEventPayload() );
        iotDeviceEventLogEntity.setEventTime( vo.getEventTime() );
        iotDeviceEventLogEntity.setEventType( vo.getEventType() );
        iotDeviceEventLogEntity.setEventUid( vo.getEventUid() );

        return iotDeviceEventLogEntity;
    }

    @Override
    public IotDeviceEventLogVO convert(IotDeviceEventLogEntity entity) {
        if ( entity == null ) {
            return null;
        }

        IotDeviceEventLogVO iotDeviceEventLogVO = new IotDeviceEventLogVO();

        iotDeviceEventLogVO.setEventPayload( entity.getEventPayload() );
        iotDeviceEventLogVO.setEventTime( entity.getEventTime() );
        iotDeviceEventLogVO.setEventType( entity.getEventType() );
        iotDeviceEventLogVO.setEventUid( entity.getEventUid() );

        return iotDeviceEventLogVO;
    }

    @Override
    public List<IotDeviceEventLogVO> convertList(List<IotDeviceEventLogEntity> list) {
        if ( list == null ) {
            return null;
        }

        List<IotDeviceEventLogVO> list1 = new ArrayList<IotDeviceEventLogVO>( list.size() );
        for ( IotDeviceEventLogEntity iotDeviceEventLogEntity : list ) {
            list1.add( convert( iotDeviceEventLogEntity ) );
        }

        return list1;
    }
}
