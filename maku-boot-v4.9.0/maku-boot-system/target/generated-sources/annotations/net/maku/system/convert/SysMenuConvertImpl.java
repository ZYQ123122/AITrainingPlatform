package net.maku.system.convert;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import net.maku.system.entity.SysMenuEntity;
import net.maku.system.vo.SysMenuVO;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-02-10T16:08:32+0800",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.45.0.v20260128-0750, environment: Java 21.0.9 (Eclipse Adoptium)"
)
public class SysMenuConvertImpl implements SysMenuConvert {

    @Override
    public SysMenuEntity convert(SysMenuVO vo) {
        if ( vo == null ) {
            return null;
        }

        SysMenuEntity sysMenuEntity = new SysMenuEntity();

        sysMenuEntity.setId( vo.getId() );
        sysMenuEntity.setCreateTime( vo.getCreateTime() );
        sysMenuEntity.setAuthority( vo.getAuthority() );
        sysMenuEntity.setIcon( vo.getIcon() );
        sysMenuEntity.setName( vo.getName() );
        sysMenuEntity.setOpenStyle( vo.getOpenStyle() );
        sysMenuEntity.setPid( vo.getPid() );
        sysMenuEntity.setSort( vo.getSort() );
        sysMenuEntity.setType( vo.getType() );
        sysMenuEntity.setUrl( vo.getUrl() );

        return sysMenuEntity;
    }

    @Override
    public SysMenuVO convert(SysMenuEntity entity) {
        if ( entity == null ) {
            return null;
        }

        SysMenuVO sysMenuVO = new SysMenuVO();

        sysMenuVO.setId( entity.getId() );
        sysMenuVO.setPid( entity.getPid() );
        sysMenuVO.setAuthority( entity.getAuthority() );
        sysMenuVO.setCreateTime( entity.getCreateTime() );
        sysMenuVO.setIcon( entity.getIcon() );
        sysMenuVO.setName( entity.getName() );
        sysMenuVO.setOpenStyle( entity.getOpenStyle() );
        sysMenuVO.setSort( entity.getSort() );
        sysMenuVO.setType( entity.getType() );
        sysMenuVO.setUrl( entity.getUrl() );

        return sysMenuVO;
    }

    @Override
    public List<SysMenuVO> convertList(List<SysMenuEntity> list) {
        if ( list == null ) {
            return null;
        }

        List<SysMenuVO> list1 = new ArrayList<SysMenuVO>( list.size() );
        for ( SysMenuEntity sysMenuEntity : list ) {
            list1.add( convert( sysMenuEntity ) );
        }

        return list1;
    }
}
