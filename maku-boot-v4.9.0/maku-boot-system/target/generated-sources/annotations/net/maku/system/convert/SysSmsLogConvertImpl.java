package net.maku.system.convert;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import net.maku.system.entity.SysSmsLogEntity;
import net.maku.system.vo.SysSmsLogVO;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-02-10T16:08:33+0800",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.45.0.v20260128-0750, environment: Java 21.0.9 (Eclipse Adoptium)"
)
public class SysSmsLogConvertImpl implements SysSmsLogConvert {

    @Override
    public SysSmsLogVO convert(SysSmsLogEntity entity) {
        if ( entity == null ) {
            return null;
        }

        SysSmsLogVO sysSmsLogVO = new SysSmsLogVO();

        sysSmsLogVO.setCreateTime( entity.getCreateTime() );
        sysSmsLogVO.setError( entity.getError() );
        sysSmsLogVO.setId( entity.getId() );
        sysSmsLogVO.setMobile( entity.getMobile() );
        sysSmsLogVO.setParams( entity.getParams() );
        sysSmsLogVO.setPlatform( entity.getPlatform() );
        sysSmsLogVO.setPlatformId( entity.getPlatformId() );
        sysSmsLogVO.setStatus( entity.getStatus() );

        return sysSmsLogVO;
    }

    @Override
    public List<SysSmsLogVO> convertList(List<SysSmsLogEntity> list) {
        if ( list == null ) {
            return null;
        }

        List<SysSmsLogVO> list1 = new ArrayList<SysSmsLogVO>( list.size() );
        for ( SysSmsLogEntity sysSmsLogEntity : list ) {
            list1.add( convert( sysSmsLogEntity ) );
        }

        return list1;
    }
}
