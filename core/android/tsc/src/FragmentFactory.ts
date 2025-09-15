import { fragmentMapper } from './FragmentMapper';

export default class FragmentFactory {
    static fragmentMapperMap:any = {};
    createNewInstance(fileName:string, namespace: string = '') {
        if (!namespace || namespace == '') {
            return new fragmentMapper[fileName]();
        } else {
            const fragment = FragmentFactory.fragmentMapperMap[namespace][fileName];
            return fragment.createInstance();
        }
    }

    static registerFragmentMapper(namespace: string, fragmentMapper:any) {
        FragmentFactory.fragmentMapperMap[namespace] = fragmentMapper;
    }
}