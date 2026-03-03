package net.maku.system.convert;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import net.maku.system.entity.SysOrgEntity;
import net.maku.system.vo.SysOrgVO;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-02-10T16:08:32+0800",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.45.0.v20260128-0750, environment: Java 21.0.9 (Eclipse Adoptium)"
)
public class SysOrgConvertImpl implements SysOrgConvert {

    @Override
    public SysOrgEntity convert(SysOrgVO vo) {
        if ( vo == null ) {
            return null;
        }

        SysOrgEntity sysOrgEntity = new SysOrgEntity();

        sysOrgEntity.setId( vo.getId() );
        sysOrgEntity.setCreateTime( vo.getCreateTime() );
        sysOrgEntity.setLeaderId( vo.getLeaderId() );
        sysOrgEntity.setName( vo.getName() );
        sysOrgEntity.setParentName( vo.getParentName() );
        sysOrgEntity.setPid( vo.getPid() );
        sysOrgEntity.setSort( vo.getSort() );

        return sysOrgEntity;
    }

    @Override
    public SysOrgVO convert(SysOrgEntity entity) {
        if ( entity == null ) {
            return null;
        }

        SysOrgVO sysOrgVO = new SysOrgVO();

        sysOrgVO.setId( entity.getId() );
        sysOrgVO.setPid( entity.getPid() );
        sysOrgVO.setCreateTime( entity.getCreateTime() );
        sysOrgVO.setLeaderId( entity.getLeaderId() );
        sysOrgVO.setName( entity.getName() );
        sysOrgVO.setParentName( entity.getParentName() );
        sysOrgVO.setSort( entity.getSort() );

        return sysOrgVO;
    }

    @Override
    public List<SysOrgVO> convertList(List<SysOrgEntity> list) {
        if ( list == null ) {
            return null;
        }

        List<SysOrgVO> list1 = new ArrayList<SysOrgVO>( list.size() );
        for ( SysOrgEntity sysOrgEntity : list ) {
            list1.add( convert( sysOrgEntity ) );
        }

        return list1;
    }
}
