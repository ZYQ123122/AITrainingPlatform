package net.maku.system.convert;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import net.maku.system.entity.SysRoleEntity;
import net.maku.system.vo.SysRoleVO;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-02-10T16:08:32+0800",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.45.0.v20260128-0750, environment: Java 21.0.9 (Eclipse Adoptium)"
)
public class SysRoleConvertImpl implements SysRoleConvert {

    @Override
    public SysRoleVO convert(SysRoleEntity entity) {
        if ( entity == null ) {
            return null;
        }

        SysRoleVO sysRoleVO = new SysRoleVO();

        sysRoleVO.setCreateTime( entity.getCreateTime() );
        sysRoleVO.setDataScope( entity.getDataScope() );
        sysRoleVO.setId( entity.getId() );
        sysRoleVO.setName( entity.getName() );
        sysRoleVO.setRemark( entity.getRemark() );
        sysRoleVO.setRoleCode( entity.getRoleCode() );

        return sysRoleVO;
    }

    @Override
    public SysRoleEntity convert(SysRoleVO vo) {
        if ( vo == null ) {
            return null;
        }

        SysRoleEntity sysRoleEntity = new SysRoleEntity();

        sysRoleEntity.setId( vo.getId() );
        sysRoleEntity.setCreateTime( vo.getCreateTime() );
        sysRoleEntity.setDataScope( vo.getDataScope() );
        sysRoleEntity.setName( vo.getName() );
        sysRoleEntity.setRemark( vo.getRemark() );
        sysRoleEntity.setRoleCode( vo.getRoleCode() );

        return sysRoleEntity;
    }

    @Override
    public List<SysRoleVO> convertList(List<SysRoleEntity> list) {
        if ( list == null ) {
            return null;
        }

        List<SysRoleVO> list1 = new ArrayList<SysRoleVO>( list.size() );
        for ( SysRoleEntity sysRoleEntity : list ) {
            list1.add( convert( sysRoleEntity ) );
        }

        return list1;
    }
}
