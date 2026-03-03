package net.maku.system.convert;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import net.maku.system.entity.SysThirdLoginConfigEntity;
import net.maku.system.vo.SysThirdLoginConfigVO;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-02-10T16:08:32+0800",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.45.0.v20260128-0750, environment: Java 21.0.9 (Eclipse Adoptium)"
)
public class SysThirdLoginConfigConvertImpl implements SysThirdLoginConfigConvert {

    @Override
    public SysThirdLoginConfigEntity convert(SysThirdLoginConfigVO vo) {
        if ( vo == null ) {
            return null;
        }

        SysThirdLoginConfigEntity sysThirdLoginConfigEntity = new SysThirdLoginConfigEntity();

        sysThirdLoginConfigEntity.setAgentId( vo.getAgentId() );
        sysThirdLoginConfigEntity.setClientId( vo.getClientId() );
        sysThirdLoginConfigEntity.setClientSecret( vo.getClientSecret() );
        sysThirdLoginConfigEntity.setCreateTime( vo.getCreateTime() );
        sysThirdLoginConfigEntity.setId( vo.getId() );
        sysThirdLoginConfigEntity.setOpenType( vo.getOpenType() );
        sysThirdLoginConfigEntity.setRedirectUri( vo.getRedirectUri() );

        return sysThirdLoginConfigEntity;
    }

    @Override
    public SysThirdLoginConfigVO convert(SysThirdLoginConfigEntity entity) {
        if ( entity == null ) {
            return null;
        }

        SysThirdLoginConfigVO sysThirdLoginConfigVO = new SysThirdLoginConfigVO();

        sysThirdLoginConfigVO.setAgentId( entity.getAgentId() );
        sysThirdLoginConfigVO.setClientId( entity.getClientId() );
        sysThirdLoginConfigVO.setClientSecret( entity.getClientSecret() );
        sysThirdLoginConfigVO.setCreateTime( entity.getCreateTime() );
        sysThirdLoginConfigVO.setId( entity.getId() );
        sysThirdLoginConfigVO.setOpenType( entity.getOpenType() );
        sysThirdLoginConfigVO.setRedirectUri( entity.getRedirectUri() );

        return sysThirdLoginConfigVO;
    }

    @Override
    public List<SysThirdLoginConfigVO> convertList(List<SysThirdLoginConfigEntity> list) {
        if ( list == null ) {
            return null;
        }

        List<SysThirdLoginConfigVO> list1 = new ArrayList<SysThirdLoginConfigVO>( list.size() );
        for ( SysThirdLoginConfigEntity sysThirdLoginConfigEntity : list ) {
            list1.add( convert( sysThirdLoginConfigEntity ) );
        }

        return list1;
    }
}
