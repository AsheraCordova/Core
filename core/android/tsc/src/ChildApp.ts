import LocaleManager from "./app/LocaleManager";
import { fragmentMapper as mapper } from "./FragmentMapper";

class AppLoaderWrapper {
    async loadApp(rootDirectory: string) {
        await this.initLocale(rootDirectory);
    }

    initLocale(rootDirectory: string): Promise<void> {
        return new Promise((resolve) => {
            LocaleManager.getInstance().init(() => {
                resolve();
            }, rootDirectory);
        });
    }
}

(window as any).__DYNAMIC_MODULE__ = {fragmentMapper: mapper, AppLoader: AppLoaderWrapper};
export const fragmentMapper = mapper;
export const AppLoader = AppLoaderWrapper;