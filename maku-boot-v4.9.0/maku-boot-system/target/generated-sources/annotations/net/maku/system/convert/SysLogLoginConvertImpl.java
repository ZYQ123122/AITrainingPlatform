package net.maku.system.convert;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import net.maku.system.entity.SysLogLoginEntity;
import net.maku.system.vo.SysLogLoginVO;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-02-10T16:08:31+0800",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.45.0.v20260128-0750, environment: Java 21.0.9 (Eclipse Adoptium)"
)
public class SysLogLoginConvertImpl implements SysLogLoginConvert {

    @Override
    public SysLogLoginEntity convert(SysLogLoginVO vo) {
        if ( vo == null ) {
            return null;
        }

        SysLogLoginEntity sysLogLoginEntity = new SysLogLoginEntity();

        sysLogLoginEntity.setAddress( vo.getAddress() );
        sysLogLoginEntity.setCreateTime( vo.getCreateTime() );
        sysLogLoginEntity.setId( vo.getId() );
        sysLogLoginEntity.setIp( vo.getIp() );
        sysLogLoginEntity.setOperation( vo.getOperation() );
        sysLogLoginEntity.setStatus( vo.getStatus() );
        sysLogLoginEntity.setUserAgent( vo.getUserAgent() );
        sysLogLoginEntity.setUsername( vo.getUsername() );

        return sysLogLoginEntity;
    }

    @Override
    public SysLogLoginVO convert(SysLogLoginEntity entity) {
        if ( entity == null ) {
            return null;
        }

        SysLogLoginVO sysLogLoginVO = new SysLogLoginVO();

        sysLogLoginVO.setAddress( entity.getAddress() );
        sysLogLoginVO.setCreateTime( entity.getCreateTime() );
        sysLogLoginVO.setId( entity.getId() );
        sysLogLoginVO.setIp( entity.getIp() );
        sysLogLoginVO.setOperation( entity.getOperation() );
        sysLogLoginVO.setStatus( entity.getStatus() );
        sysLogLoginVO.setUserAgent( entity.getUserAgent() );
        sysLogLoginVO.setUsername( entity.getUsername() );

        return sysLogLoginVO;
    }

    @Override
    public List<SysLogLoginVO> convertList(List<SysLogLoginEntity> list) {
        if ( list == null ) {
            return null;
        }

        List<SysLogLoginVO> list1 = new ArrayList<SysLogLoginVO>( list.size() );
        for ( SysLogLoginEntity sysLogLoginEntity : list ) {
            list1.add( convert( sysLogLoginEntity ) );
        }

        return list1;
    }
}
