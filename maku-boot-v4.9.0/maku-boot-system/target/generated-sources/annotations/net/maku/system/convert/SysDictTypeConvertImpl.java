package net.maku.system.convert;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import net.maku.system.entity.SysDictTypeEntity;
import net.maku.system.vo.SysDictTypeVO;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-02-10T16:08:33+0800",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.45.0.v20260128-0750, environment: Java 21.0.9 (Eclipse Adoptium)"
)
public class SysDictTypeConvertImpl implements SysDictTypeConvert {

    @Override
    public SysDictTypeVO convert(SysDictTypeEntity entity) {
        if ( entity == null ) {
            return null;
        }

        SysDictTypeVO sysDictTypeVO = new SysDictTypeVO();

        sysDictTypeVO.setCreateTime( entity.getCreateTime() );
        sysDictTypeVO.setDictName( entity.getDictName() );
        sysDictTypeVO.setDictSource( entity.getDictSource() );
        sysDictTypeVO.setDictSql( entity.getDictSql() );
        sysDictTypeVO.setDictType( entity.getDictType() );
        sysDictTypeVO.setHasChild( entity.getHasChild() );
        sysDictTypeVO.setId( entity.getId() );
        sysDictTypeVO.setPid( entity.getPid() );
        sysDictTypeVO.setRemark( entity.getRemark() );
        sysDictTypeVO.setSort( entity.getSort() );
        sysDictTypeVO.setUpdateTime( entity.getUpdateTime() );

        return sysDictTypeVO;
    }

    @Override
    public SysDictTypeEntity convert(SysDictTypeVO vo) {
        if ( vo == null ) {
            return null;
        }

        SysDictTypeEntity sysDictTypeEntity = new SysDictTypeEntity();

        sysDictTypeEntity.setId( vo.getId() );
        sysDictTypeEntity.setCreateTime( vo.getCreateTime() );
        sysDictTypeEntity.setUpdateTime( vo.getUpdateTime() );
        sysDictTypeEntity.setDictName( vo.getDictName() );
        sysDictTypeEntity.setDictSource( vo.getDictSource() );
        sysDictTypeEntity.setDictSql( vo.getDictSql() );
        sysDictTypeEntity.setDictType( vo.getDictType() );
        sysDictTypeEntity.setHasChild( vo.getHasChild() );
        sysDictTypeEntity.setPid( vo.getPid() );
        sysDictTypeEntity.setRemark( vo.getRemark() );
        sysDictTypeEntity.setSort( vo.getSort() );

        return sysDictTypeEntity;
    }

    @Override
    public List<SysDictTypeVO> convertList(List<SysDictTypeEntity> list) {
        if ( list == null ) {
            return null;
        }

        List<SysDictTypeVO> list1 = new ArrayList<SysDictTypeVO>( list.size() );
        for ( SysDictTypeEntity sysDictTypeEntity : list ) {
            list1.add( convert( sysDictTypeEntity ) );
        }

        return list1;
    }
}
