package net.maku.system.convert;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import net.maku.system.entity.SysPostEntity;
import net.maku.system.vo.SysPostVO;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-02-10T16:08:32+0800",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.45.0.v20260128-0750, environment: Java 21.0.9 (Eclipse Adoptium)"
)
public class SysPostConvertImpl implements SysPostConvert {

    @Override
    public SysPostVO convert(SysPostEntity entity) {
        if ( entity == null ) {
            return null;
        }

        SysPostVO sysPostVO = new SysPostVO();

        sysPostVO.setCreateTime( entity.getCreateTime() );
        sysPostVO.setId( entity.getId() );
        sysPostVO.setPostCode( entity.getPostCode() );
        sysPostVO.setPostName( entity.getPostName() );
        sysPostVO.setSort( entity.getSort() );
        sysPostVO.setStatus( entity.getStatus() );

        return sysPostVO;
    }

    @Override
    public SysPostEntity convert(SysPostVO vo) {
        if ( vo == null ) {
            return null;
        }

        SysPostEntity sysPostEntity = new SysPostEntity();

        sysPostEntity.setId( vo.getId() );
        sysPostEntity.setCreateTime( vo.getCreateTime() );
        sysPostEntity.setPostCode( vo.getPostCode() );
        sysPostEntity.setPostName( vo.getPostName() );
        sysPostEntity.setSort( vo.getSort() );
        sysPostEntity.setStatus( vo.getStatus() );

        return sysPostEntity;
    }

    @Override
    public List<SysPostVO> convertList(List<SysPostEntity> list) {
        if ( list == null ) {
            return null;
        }

        List<SysPostVO> list1 = new ArrayList<SysPostVO>( list.size() );
        for ( SysPostEntity sysPostEntity : list ) {
            list1.add( convert( sysPostEntity ) );
        }

        return list1;
    }
}
