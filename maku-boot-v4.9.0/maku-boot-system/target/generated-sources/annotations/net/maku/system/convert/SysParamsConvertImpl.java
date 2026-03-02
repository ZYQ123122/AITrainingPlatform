package net.maku.system.convert;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import net.maku.system.entity.SysParamsEntity;
import net.maku.system.vo.SysParamsVO;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-02-10T16:08:33+0800",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.45.0.v20260128-0750, environment: Java 21.0.9 (Eclipse Adoptium)"
)
public class SysParamsConvertImpl implements SysParamsConvert {

    @Override
    public SysParamsEntity convert(SysParamsVO vo) {
        if ( vo == null ) {
            return null;
        }

        SysParamsEntity sysParamsEntity = new SysParamsEntity();

        sysParamsEntity.setId( vo.getId() );
        sysParamsEntity.setCreator( vo.getCreator() );
        sysParamsEntity.setCreateTime( vo.getCreateTime() );
        sysParamsEntity.setUpdater( vo.getUpdater() );
        sysParamsEntity.setUpdateTime( vo.getUpdateTime() );
        sysParamsEntity.setVersion( vo.getVersion() );
        sysParamsEntity.setDeleted( vo.getDeleted() );
        sysParamsEntity.setParamKey( vo.getParamKey() );
        sysParamsEntity.setParamName( vo.getParamName() );
        sysParamsEntity.setParamType( vo.getParamType() );
        sysParamsEntity.setParamValue( vo.getParamValue() );
        sysParamsEntity.setRemark( vo.getRemark() );

        return sysParamsEntity;
    }

    @Override
    public SysParamsVO convert(SysParamsEntity entity) {
        if ( entity == null ) {
            return null;
        }

        SysParamsVO sysParamsVO = new SysParamsVO();

        sysParamsVO.setCreateTime( entity.getCreateTime() );
        sysParamsVO.setCreator( entity.getCreator() );
        sysParamsVO.setDeleted( entity.getDeleted() );
        sysParamsVO.setId( entity.getId() );
        sysParamsVO.setParamKey( entity.getParamKey() );
        sysParamsVO.setParamName( entity.getParamName() );
        sysParamsVO.setParamType( entity.getParamType() );
        sysParamsVO.setParamValue( entity.getParamValue() );
        sysParamsVO.setRemark( entity.getRemark() );
        sysParamsVO.setUpdateTime( entity.getUpdateTime() );
        sysParamsVO.setUpdater( entity.getUpdater() );
        sysParamsVO.setVersion( entity.getVersion() );

        return sysParamsVO;
    }

    @Override
    public List<SysParamsVO> convertList(List<SysParamsEntity> list) {
        if ( list == null ) {
            return null;
        }

        List<SysParamsVO> list1 = new ArrayList<SysParamsVO>( list.size() );
        for ( SysParamsEntity sysParamsEntity : list ) {
            list1.add( convert( sysParamsEntity ) );
        }

        return list1;
    }
}
