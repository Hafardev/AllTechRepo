// Generated by Dagger (https://dagger.dev).
package com.example.data.dataSource;

import com.example.data.entityModel.userRepo.GetUserRepositoriesParam;
import com.example.data.repository.UserGitRepositoryImp;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class PaginationDataSource_Factory implements Factory<PaginationDataSource> {
  private final Provider<UserGitRepositoryImp> dataRepositoryProvider;

  private final Provider<GetUserRepositoriesParam> paramModelProvider;

  public PaginationDataSource_Factory(Provider<UserGitRepositoryImp> dataRepositoryProvider,
      Provider<GetUserRepositoriesParam> paramModelProvider) {
    this.dataRepositoryProvider = dataRepositoryProvider;
    this.paramModelProvider = paramModelProvider;
  }

  @Override
  public PaginationDataSource get() {
    return newInstance(dataRepositoryProvider.get(), paramModelProvider.get());
  }

  public static PaginationDataSource_Factory create(
      Provider<UserGitRepositoryImp> dataRepositoryProvider,
      Provider<GetUserRepositoriesParam> paramModelProvider) {
    return new PaginationDataSource_Factory(dataRepositoryProvider, paramModelProvider);
  }

  public static PaginationDataSource newInstance(UserGitRepositoryImp dataRepository,
      GetUserRepositoriesParam paramModel) {
    return new PaginationDataSource(dataRepository, paramModel);
  }
}
