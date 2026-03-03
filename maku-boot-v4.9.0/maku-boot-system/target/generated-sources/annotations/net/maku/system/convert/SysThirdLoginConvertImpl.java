package net.maku.system.convert;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import net.maku.system.entity.SysThirdLoginEntity;
import net.maku.system.vo.SysThirdLoginVO;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-02-10T16:08:32+0800",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.45.0.v20260128-0750, environment: Java 21.0.9 (Eclipse Adoptium)"
)
public class SysThirdLoginConvertImpl implements SysThirdLoginConvert {

    @Override
    public SysThirdLoginEntity convert(SysThirdLoginVO vo) {
        if ( vo == null ) {
            return null;
        }

        SysThirdLoginEntity sysThirdLoginEntity = new SysThirdLoginEntity();

        sysThirdLoginEntity.setCreateTime( vo.getCreateTime() );
        sysThirdLoginEntity.setId( vo.getId() );
        sysThirdLoginEntity.setOpenId( vo.getOpenId() );
        sysThirdLoginEntity.setOpenType( vo.getOpenType() );
        sysThirdLoginEntity.setTenantId( vo.getTenantId() );
        sysThirdLoginEntity.setUserId( vo.getUserId() );
        sysThirdLoginEntity.setUsername( vo.getUsername() );

        return sysThirdLoginEntity;
    }

    @Override
    public SysThirdLoginVO convert(SysThirdLoginEntity entity) {
        if ( entity == null ) {
            return null;
        }

        SysThirdLoginVO sysThirdLoginVO = new SysThirdLoginVO();

        sysThirdLoginVO.setCreateTime( entity.getCreateTime() );
        sysThirdLoginVO.setId( entity.getId() );
        sysThirdLoginVO.setOpenId( entity.getOpenId() );
        sysThirdLoginVO.setOpenType( entity.getOpenType() );
        sysThirdLoginVO.setTenantId( entity.getTenantId() );
        sysThirdLoginVO.setUserId( entity.getUserId() );
        sysThirdLoginVO.setUsername( entity.getUsername() );

        return sysThirdLoginVO;
    }

    @Override
    public List<SysThirdLoginVO> convertList(List<SysThirdLoginEntity> list) {
        if ( list == null ) {
            return null;
        }

        List<SysThirdLoginVO> list1 = new ArrayList<SysThirdLoginVO>( list.size() );
        for ( SysThirdLoginEntity sysThirdLoginEntity : list ) {
            list1.add( convert( sysThirdLoginEntity ) );
        }

        return list1;
    }
}
