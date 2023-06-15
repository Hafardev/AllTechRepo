// Generated by Dagger (https://dagger.dev).
package com.example.domain.useCase;

import com.example.domain.repository.UserGitRepository;
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
public final class ReadUserFavoriteListUseCase_Factory implements Factory<ReadUserFavoriteListUseCase> {
  private final Provider<UserGitRepository> userGitRepositoryProvider;

  public ReadUserFavoriteListUseCase_Factory(
      Provider<UserGitRepository> userGitRepositoryProvider) {
    this.userGitRepositoryProvider = userGitRepositoryProvider;
  }

  @Override
  public ReadUserFavoriteListUseCase get() {
    return newInstance(userGitRepositoryProvider.get());
  }

  public static ReadUserFavoriteListUseCase_Factory create(
      Provider<UserGitRepository> userGitRepositoryProvider) {
    return new ReadUserFavoriteListUseCase_Factory(userGitRepositoryProvider);
  }

  public static ReadUserFavoriteListUseCase newInstance(UserGitRepository userGitRepository) {
    return new ReadUserFavoriteListUseCase(userGitRepository);
  }
}
