package net.maku.system.convert;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import net.maku.system.entity.SysMailLogEntity;
import net.maku.system.vo.SysMailLogVO;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-02-10T16:08:32+0800",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.45.0.v20260128-0750, environment: Java 21.0.9 (Eclipse Adoptium)"
)
public class SysMailLogConvertImpl implements SysMailLogConvert {

    @Override
    public SysMailLogEntity convert(SysMailLogVO vo) {
        if ( vo == null ) {
            return null;
        }

        SysMailLogEntity sysMailLogEntity = new SysMailLogEntity();

        sysMailLogEntity.setContent( vo.getContent() );
        sysMailLogEntity.setCreateTime( vo.getCreateTime() );
        sysMailLogEntity.setError( vo.getError() );
        sysMailLogEntity.setId( vo.getId() );
        sysMailLogEntity.setMailFrom( vo.getMailFrom() );
        sysMailLogEntity.setMailTos( vo.getMailTos() );
        sysMailLogEntity.setPlatform( vo.getPlatform() );
        sysMailLogEntity.setPlatformId( vo.getPlatformId() );
        sysMailLogEntity.setStatus( vo.getStatus() );
        sysMailLogEntity.setSubject( vo.getSubject() );

        return sysMailLogEntity;
    }

    @Override
    public SysMailLogVO convert(SysMailLogEntity entity) {
        if ( entity == null ) {
            return null;
        }

        SysMailLogVO sysMailLogVO = new SysMailLogVO();

        sysMailLogVO.setContent( entity.getContent() );
        sysMailLogVO.setCreateTime( entity.getCreateTime() );
        sysMailLogVO.setError( entity.getError() );
        sysMailLogVO.setId( entity.getId() );
        sysMailLogVO.setMailFrom( entity.getMailFrom() );
        sysMailLogVO.setMailTos( entity.getMailTos() );
        sysMailLogVO.setPlatform( entity.getPlatform() );
        sysMailLogVO.setPlatformId( entity.getPlatformId() );
        sysMailLogVO.setStatus( entity.getStatus() );
        sysMailLogVO.setSubject( entity.getSubject() );

        return sysMailLogVO;
    }

    @Override
    public List<SysMailLogVO> convertList(List<SysMailLogEntity> list) {
        if ( list == null ) {
            return null;
        }

        List<SysMailLogVO> list1 = new ArrayList<SysMailLogVO>( list.size() );
        for ( SysMailLogEntity sysMailLogEntity : list ) {
            list1.add( convert( sysMailLogEntity ) );
        }

        return list1;
    }
}
