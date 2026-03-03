package net.maku.system.convert;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import net.maku.system.entity.SysAttachmentEntity;
import net.maku.system.vo.SysAttachmentVO;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-02-10T16:08:32+0800",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.45.0.v20260128-0750, environment: Java 21.0.9 (Eclipse Adoptium)"
)
public class SysAttachmentConvertImpl implements SysAttachmentConvert {

    @Override
    public SysAttachmentEntity convert(SysAttachmentVO vo) {
        if ( vo == null ) {
            return null;
        }

        SysAttachmentEntity sysAttachmentEntity = new SysAttachmentEntity();

        sysAttachmentEntity.setId( vo.getId() );
        sysAttachmentEntity.setCreateTime( vo.getCreateTime() );
        sysAttachmentEntity.setName( vo.getName() );
        sysAttachmentEntity.setPlatform( vo.getPlatform() );
        sysAttachmentEntity.setSize( vo.getSize() );
        sysAttachmentEntity.setUrl( vo.getUrl() );

        return sysAttachmentEntity;
    }

    @Override
    public SysAttachmentVO convert(SysAttachmentEntity entity) {
        if ( entity == null ) {
            return null;
        }

        SysAttachmentVO sysAttachmentVO = new SysAttachmentVO();

        sysAttachmentVO.setCreateTime( entity.getCreateTime() );
        sysAttachmentVO.setId( entity.getId() );
        sysAttachmentVO.setName( entity.getName() );
        sysAttachmentVO.setPlatform( entity.getPlatform() );
        sysAttachmentVO.setSize( entity.getSize() );
        sysAttachmentVO.setUrl( entity.getUrl() );

        return sysAttachmentVO;
    }

    @Override
    public List<SysAttachmentVO> convertList(List<SysAttachmentEntity> list) {
        if ( list == null ) {
            return null;
        }

        List<SysAttachmentVO> list1 = new ArrayList<SysAttachmentVO>( list.size() );
        for ( SysAttachmentEntity sysAttachmentEntity : list ) {
            list1.add( convert( sysAttachmentEntity ) );
        }

        return list1;
    }
}
